//
//  Generated from FHIR Version 5.0.0
//
package com.icure.fhir.mapping.domain.fhir.r5.dosage

import com.icure.fhir.mapping.domain.fhir.r5.Quantity
import com.icure.fhir.mapping.domain.fhir.r5.backbonetype.BackboneType
import com.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import com.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import com.icure.fhir.mapping.domain.fhir.r5.ratio.Ratio
import com.icure.fhir.mapping.domain.fhir.r5.timing.Timing
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
 * @param asNeeded Take "as needed"
 * @param site Body site to administer to
 * @param route How drug should enter body
 * @param method Technique for administering medication
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
   * Take "as needed"
   */
  public val asNeeded: Boolean? = null,
  public val asNeededFor: List<CodeableConcept> = emptyList(),
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
  public val maxDosePerPeriod: List<Ratio> = emptyList(),
  /**
   * Upper limit on medication per administration
   */
  public val maxDosePerAdministration: Quantity? = null,
  /**
   * Upper limit on medication per lifetime of the patient
   */
  public val maxDosePerLifetime: Quantity? = null,
) : BackboneType
