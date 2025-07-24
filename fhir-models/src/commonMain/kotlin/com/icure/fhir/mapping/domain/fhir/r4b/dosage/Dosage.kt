//
//  Generated from FHIR Version 4.3.0
//
package com.icure.fhir.mapping.domain.fhir.r4b.dosage

import com.icure.fhir.mapping.domain.fhir.r4b.Quantity
import com.icure.fhir.mapping.domain.fhir.r4b.backboneelement.BackboneElement
import com.icure.fhir.mapping.domain.fhir.r4b.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r4b.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r4b.ratio.Ratio
import com.icure.fhir.mapping.domain.fhir.r4b.timing.Timing
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * How the medication is/was taken or should be taken
 *
 * Indicates how the medication is/was taken or should be taken by the patient.
 *
 * @param id Unique id for inter-element referencing
 * @param sequence The order of the dosage instructions
 * @param text Free text dosage instructions e.g. SIG
 * @param patientInstruction Patient or consumer oriented instructions
 * @param timing When medication should be administered
 * @param asNeededBoolean Take "as needed" (for x)
 * @param asNeededCodeableConcept Take "as needed" (for x)
 * @param site Body site to administer to
 * @param route How drug should enter body
 * @param method Technique for administering medication
 * @param maxDosePerPeriod Upper limit on medication per unit of time
 * @param maxDosePerAdministration Upper limit on medication per administration
 * @param maxDosePerLifetime Upper limit on medication per lifetime of the patient
 */
@SerialName("Dosage")
@Serializable
public data class Dosage(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * The order of the dosage instructions
   */
  public val sequence: Int? = null,
  /**
   * Free text dosage instructions e.g. SIG
   */
  public val text: String? = null,
  public val additionalInstruction: List<CodeableConcept> = emptyList(),
  /**
   * Patient or consumer oriented instructions
   */
  public val patientInstruction: String? = null,
  /**
   * When medication should be administered
   */
  public val timing: Timing? = null,
  /**
   * Take "as needed" (for x)
   */
  public val asNeededBoolean: Boolean? = null,
  /**
   * Take "as needed" (for x)
   */
  public val asNeededCodeableConcept: CodeableConcept? = null,
  /**
   * Body site to administer to
   */
  public val site: CodeableConcept? = null,
  /**
   * How drug should enter body
   */
  public val route: CodeableConcept? = null,
  /**
   * Technique for administering medication
   */
  public val method: CodeableConcept? = null,
  public val doseAndRate: List<DosageDoseAndRate> = emptyList(),
  /**
   * Upper limit on medication per unit of time
   */
  public val maxDosePerPeriod: Ratio? = null,
  /**
   * Upper limit on medication per administration
   */
  public val maxDosePerAdministration: Quantity? = null,
  /**
   * Upper limit on medication per lifetime of the patient
   */
  public val maxDosePerLifetime: Quantity? = null,
) : BackboneElement
