//
//  Generated from FHIR Version 5.0.0
//
package io.icure.fhir.mapping.domain.fhir.r5.account

import io.icure.fhir.mapping.domain.fhir.r5.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r5.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r5.codeablereference.CodeableReference
import io.icure.fhir.mapping.domain.fhir.r5.extension.Extension
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * The list of diagnoses relevant to this account
 *
 * When using an account for billing a specific Encounter the set of diagnoses that are relevant for
 * billing are stored here on the account where they are able to be sequenced appropriately prior to
 * processing to produce claim(s).
 *
 * @param id Unique id for inter-element referencing
 * @param sequence Ranking of the diagnosis (for each type)
 * @param condition The diagnosis relevant to the account
 * @param dateOfDiagnosis Date of the diagnosis (when coded diagnosis)
 * @param onAdmission Diagnosis present on Admission
 */
@SerialName("AccountDiagnosis")
@Serializable
public data class AccountDiagnosis(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Ranking of the diagnosis (for each type)
   */
  public val sequence: Int? = null,
  /**
   * The diagnosis relevant to the account
   */
  public val condition: CodeableReference,
  /**
   * Date of the diagnosis (when coded diagnosis)
   */
  public val dateOfDiagnosis: String? = null,
  public val type: List<CodeableConcept> = emptyList(),
  /**
   * Diagnosis present on Admission
   */
  public val onAdmission: Boolean? = null,
  public val packageCode: List<CodeableConcept> = emptyList(),
) : BackboneElement
