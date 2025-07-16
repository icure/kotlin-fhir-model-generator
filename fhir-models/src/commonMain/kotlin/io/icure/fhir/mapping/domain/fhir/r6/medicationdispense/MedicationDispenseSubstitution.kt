//
//  Generated from FHIR Version 6.0.0-ballot1
//
package io.icure.fhir.mapping.domain.fhir.r6.medicationdispense

import io.icure.fhir.mapping.domain.fhir.r6.backboneelement.BackboneElement
import io.icure.fhir.mapping.domain.fhir.r6.codeableconcept.CodeableConcept
import io.icure.fhir.mapping.domain.fhir.r6.extension.Extension
import io.icure.fhir.mapping.domain.fhir.r6.reference.Reference
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Whether a substitution was performed on the dispense
 *
 * Indicates whether or not substitution was made as part of the dispense.  In some cases,
 * substitution will be expected but does not happen, in other cases substitution is not expected but
 * does happen.  This block explains what substitution did or did not happen and why.  If nothing is
 * specified, substitution was not done.
 *
 * @param id Unique id for inter-element referencing
 * @param wasSubstituted Whether a substitution was or was not performed on the dispense
 * @param type Code signifying whether a different drug was dispensed from what was prescribed
 * @param responsibleParty Who is responsible for the substitution
 */
@SerialName("MedicationDispenseSubstitution")
@Serializable
public data class MedicationDispenseSubstitution(
  /**
   * Unique id for inter-element referencing
   */
  override val id: String? = null,
  override val extension: List<Extension> = emptyList(),
  override val modifierExtension: List<Extension> = emptyList(),
  /**
   * Whether a substitution was or was not performed on the dispense
   */
  public val wasSubstituted: Boolean? = null,
  /**
   * Code signifying whether a different drug was dispensed from what was prescribed
   */
  public val type: CodeableConcept? = null,
  public val reason: List<CodeableConcept> = emptyList(),
  /**
   * Who is responsible for the substitution
   */
  public val responsibleParty: Reference? = null,
) : BackboneElement
